package p52;

/* loaded from: classes15.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f433580a;

    /* renamed from: b, reason: collision with root package name */
    public final yj0.d f433581b;

    public m() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f433580a = hashMap;
        this.f433581b = new p52.l(this);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.util.Pair.create("onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V"));
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("com/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener", arrayList);
        hashMap.put("com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$", hashMap2);
    }
}
