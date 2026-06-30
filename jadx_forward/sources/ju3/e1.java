package ju3;

/* loaded from: classes8.dex */
public final class e1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17020xf8b8139d f383468d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17020xf8b8139d c17020xf8b8139d) {
        this.f383468d = c17020xf8b8139d;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaTabCameraKitPluginLayout", "onRequestPermissionsResult: click cancel");
        dialogInterface.dismiss();
        android.content.Context context = this.f383468d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
        xg5.a aVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465) context).f290218e;
        if (aVar != null) {
            b33.f fVar = (b33.f) aVar;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = fVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            java.util.ArrayList arrayList = ((b33.o) pf5.z.f435481a.a(activity).a(b33.o.class)).f99210f;
            int size = arrayList.size();
            int i18 = 0;
            while (true) {
                if (i18 >= size) {
                    i18 = -1;
                    break;
                }
                java.lang.Object obj = arrayList.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                if (((java.lang.Number) ((jz5.l) obj).f384366d).intValue() == 1) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i18 != -1) {
                fVar.U6().m80845x940d026a(i18, true);
            }
        }
    }
}
