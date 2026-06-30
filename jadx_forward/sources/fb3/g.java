package fb3;

/* loaded from: classes.dex */
public final class g implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fb3.j f342395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342396b;

    public g(fb3.j jVar, java.lang.String str) {
        this.f342395a = jVar;
        this.f342396b = str;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        fb3.j jVar = this.f342395a;
        if (i17 != 0 || i18 != 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINISH_ACTIVITY_REASON", "KEY_FINISH_ACTIVITY_FOR_SEND_APPMSG_FAIL");
            jVar.m158354x19263085().setResult(-1, intent);
            jVar.m158354x19263085().finish();
            return;
        }
        if ((oVar != null ? oVar.f152244b.f152233a : null) instanceof r45.pz5) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SendShareCoverMsgResp");
            r45.pz5 pz5Var = (r45.pz5) fVar;
            if (pz5Var.f465035d != 0) {
                ik1.h0.b(new fb3.f(jVar, pz5Var));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(29977, 5, jVar.f342402f, this.f342396b, jVar.f342401e);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("KEY_FINISH_ACTIVITY_REASON", "KEY_FINISH_ACTIVITY_FOR_SEND_APPMSG_SUCCESS");
            jVar.m158354x19263085().setResult(-1, intent2);
            jVar.m158354x19263085().finish();
        }
    }
}
