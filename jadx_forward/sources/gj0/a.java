package gj0;

/* loaded from: classes7.dex */
public class a extends gj0.b {
    @Override // gj0.b
    public int b() {
        if (com.p314xaae8f345.mm.app.v5.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a()) == com.p314xaae8f345.mm.app.v5.f135397x || !com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k || wo.w0.q()) {
            return 0;
        }
        android.app.Application a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a();
        android.content.Intent putExtra = new android.content.Intent(a17, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.DialogInterfaceOnClickListenerC21429x4c64514.class).addFlags(268435456).putExtra("titleRes", com.p314xaae8f345.mm.R.C30867xcad56011.a6i).putExtra("messageRes", com.p314xaae8f345.mm.R.C30867xcad56011.a6h).putExtra("buttonRes", com.p314xaae8f345.mm.R.C30867xcad56011.a6g).putExtra("action", android.app.PendingIntent.getActivity(a17, 0, new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt) + "/")).addFlags(268435456), fp.g0.a(0)));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/fuse/AbiCompatFuse", "checkForFuseAction", "()I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        a17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(a17, "com/tencent/mm/fuse/AbiCompatFuse", "checkForFuseAction", "()I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return 2;
    }

    @Override // gj0.b
    public java.lang.String c() {
        return "abi-compat";
    }
}
