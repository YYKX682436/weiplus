package di5;

/* loaded from: classes12.dex */
public final class c extends lf3.n implements qf3.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // qf3.b
    public boolean X0(android.content.Intent intent, qf3.a listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("FinderLiveGalleryData");
        java.io.Serializable serializableExtra = intent.getSerializableExtra("FinderLiveGalleryConfig");
        t40.b bVar = serializableExtra instanceof t40.b ? (t40.b) serializableExtra : null;
        if (parcelableArrayListExtra == null || bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.FinderPostGalleryDataProvider", "fetch: data or config is null");
            return false;
        }
        mf3.f fVar = new mf3.f();
        java.lang.String str = "";
        int i17 = 0;
        int i18 = 0;
        for (java.lang.Object obj : parcelableArrayListExtra) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.api.p745xc4aaf986.C10598x47b4a646 c10598x47b4a646 = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.api.p745xc4aaf986.C10598x47b4a646) obj;
            ci5.j jVar = c10598x47b4a646.f148136d == 1 ? new ci5.j(c10598x47b4a646, bVar, false) : null;
            if (jVar != null) {
                fVar.add(jVar);
                int i27 = bVar.f497005f;
                if (i18 == i27) {
                    str = jVar.mo2110x5db1b11();
                    i17 = fVar.size() - 1;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderPostGalleryDataProvider", "enterIndex = " + i27 + "  enterId = " + str + ", selection = " + i17);
                }
            }
            i18 = i19;
        }
        lf3.c0 c0Var = (lf3.c0) listener;
        c0Var.Y6(str);
        c0Var.X6(fVar, false);
        listener.T3(i17);
        return true;
    }
}
