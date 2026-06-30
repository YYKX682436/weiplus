package te2;

/* loaded from: classes.dex */
public final class x4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f500060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f500061e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(te2.p8 p8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f500061e = p8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te2.x4(this.f500061e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.x4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f500060d;
        te2.p8 p8Var = this.f500061e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f500060d = 1;
            obj = te2.p8.P6(p8Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String fj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).fj();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0((android.graphics.Bitmap) obj, 80, android.graphics.Bitmap.CompressFormat.JPEG, fj6, true);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_File_Name", fj6);
        intent.putExtra("Retr_Compress_Type", 0);
        intent.putExtra("Retr_Msg_Type", 0);
        ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Di(intent, p8Var.B1, 1);
        android.app.Activity m80379x76847179 = p8Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        j45.l.x((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) m80379x76847179, ".ui.transmit.MsgRetransmitUI", intent, 1014, te2.w4.f500042d);
        return jz5.f0.f384359a;
    }
}
