package yv1;

/* loaded from: classes12.dex */
public final class s3 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public s3() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6278x2b7b667d event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6278x2b7b667d) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.v20 v20Var = event.f136527g;
        long j17 = v20Var.f89700a;
        if (j17 <= 0) {
            return true;
        }
        java.lang.String str = v20Var.f89701b;
        if (str == null) {
            str = "talker-ignore";
        }
        mt1.b0.f412724a.r(j17, str);
        return true;
    }
}
