package jn;

/* loaded from: classes.dex */
public class a extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f381990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f381991f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f381992g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f381993h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(jn.b bVar, int i17, r35.m3 m3Var, java.lang.ref.WeakReference weakReference, android.os.Bundle bundle, java.util.Map map, java.lang.ref.WeakReference weakReference2) {
        super(i17, m3Var);
        this.f381990e = weakReference;
        this.f381991f = bundle;
        this.f381992g = map;
        this.f381993h = weakReference2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        java.lang.ref.WeakReference weakReference = this.f381990e;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        java.lang.String string = this.f381991f.getString("conv_talker_username");
        android.content.Context context = (android.content.Context) weakReference.get();
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1.class);
        intent.setFlags(32768);
        intent.putExtra("RoomInfo_Id", string);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/chatroom/manager/ChatroomNewXmlMgr$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/chatroom/manager/ChatroomNewXmlMgr$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((ih3.e) ((tg3.k1) i95.n0.c(tg3.k1.class))).Di("link_admin_explain", this.f381992g, this.f381991f, this.f381990e, this.f381993h);
    }
}
