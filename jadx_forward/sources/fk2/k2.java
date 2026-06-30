package fk2;

/* loaded from: classes3.dex */
public final class k2 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f344951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fk2.l2 f344952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f344953f;

    public k2(dk2.zf zfVar, fk2.l2 l2Var, android.content.Context context) {
        this.f344951d = zfVar;
        this.f344952e = l2Var;
        this.f344953f = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemRecvRedPacket$onBindRecvLuckyMoneyMsg$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        dk2.zf zfVar = this.f344951d;
        if (zfVar instanceof dk2.ka) {
            java.lang.Object D = zfVar.D();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(D, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveAppMsgRecvRedPacketInfo");
            java.lang.String m75945x2fec8307 = ((r45.vj1) D).m75945x2fec8307(0);
            if (m75945x2fec8307 != null) {
                this.f344952e.q(this.f344953f, m75945x2fec8307);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemRecvRedPacket$onBindRecvLuckyMoneyMsg$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f344953f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560583od));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
