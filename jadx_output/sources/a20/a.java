package a20;

/* loaded from: classes8.dex */
public final class a extends y10.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            bw5.v8 v8Var = new bw5.v8();
            boolean[] zArr = v8Var.f34211g;
            v8Var.parseFrom(jumpInfo.g().b().f192156a);
            com.tencent.mars.xlog.Log.e("ECS_O.NativeHandler.CommonProfile", "nativeParams.accountType:" + v8Var.f34209e);
            int i17 = v8Var.f34209e;
            if (i17 == 1 || i17 == 3) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_User", zArr[1] ? v8Var.f34208d : "");
                intent.putExtra("force_get_contact", true);
                intent.putExtra("key_use_new_contact_profile", true);
                j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            } else if (i17 == 2) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("finder_username", zArr[1] ? v8Var.f34208d : "");
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(26, 2, 32, intent2);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1 e1Var = ya2.e1.f460472a;
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                e1Var.w(context2, intent2);
            }
            callback.d(null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ECS_O.NativeHandler.CommonProfile", "handle jump CommonProfile error:" + e17);
            callback.c("handle jump CommonProfile error");
        }
    }
}
