package d24;

/* loaded from: classes5.dex */
public final class z implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 f307506d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 c17513xe6a0fae1) {
        this.f307506d = c17513xe6a0fae1;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11545, java.lang.Integer.valueOf(this.f307506d.f243393s));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSettingItem", "reprot: MM_LightPushCloseWechat == OP_CloseCancel");
    }
}
