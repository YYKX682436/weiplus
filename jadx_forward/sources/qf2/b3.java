package qf2;

/* loaded from: classes3.dex */
public final class b3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.u4 f443833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f443834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.o4 f443835f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(dk2.u4 u4Var, qf2.c3 c3Var, mm2.o4 o4Var) {
        super(0);
        this.f443833d = u4Var;
        this.f443834e = c3Var;
        this.f443835f = o4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f443833d.f315693g;
        qf2.c3 c3Var = this.f443834e;
        if (i17 != 1) {
            if (i17 == 2) {
                java.util.ArrayList arrayList = zn0.x.f555947a.f555948a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList, "getRemoteUserConfigList(...)");
                java.util.Iterator it = arrayList.iterator();
                int i18 = 0;
                int i19 = 0;
                while (it.hasNext()) {
                    if (((mm2.y2) this.f443835f.m147920xbba4bfc0(mm2.y2.class)).b7(((zn0.v) it.next()).f555946n)) {
                        i18++;
                    } else {
                        i19++;
                    }
                }
                if (i18 == 0 || i19 == 0) {
                    db5.t7.m(c3Var.O6(), c3Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzz));
                }
            }
        } else if (zn0.x.f555947a.f555948a.size() == 0) {
            db5.t7.m(c3Var.O6(), c3Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzx));
        }
        return jz5.f0.f384359a;
    }
}
