package ci2;

/* loaded from: classes10.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci2.s f123231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 f123232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ci2.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950) {
        super(0);
        this.f123231d = sVar;
        this.f123232e = c14245x86828950;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ci2.s sVar = this.f123231d;
        sVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAddContentView diff tag, removeAll, tag: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = this.f123232e;
        sb6.append(c14245x86828950.getTag());
        sb6.append(" childCount: ");
        sb6.append(c14245x86828950.getChildCount());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = sVar.f353799a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c14245x86828950.getTag(), str) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c14245x86828950.getChatVoiceRoomContentLayout().getParent(), c14245x86828950)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkAddContentView same tag");
        } else {
            c14245x86828950.removeAllViews();
            android.widget.FrameLayout chatVoiceRoomContentLayout = c14245x86828950.getChatVoiceRoomContentLayout();
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, -1);
            layoutParams.f92426h = 0;
            layoutParams.f92418d = 0;
            layoutParams.f92424g = 0;
            layoutParams.f92432k = 0;
            c14245x86828950.addView(chatVoiceRoomContentLayout, layoutParams);
        }
        return jz5.f0.f384359a;
    }
}
