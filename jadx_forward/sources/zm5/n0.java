package zm5;

/* loaded from: classes4.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm5.r0 f555780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(zm5.r0 r0Var) {
        super(1);
        this.f555780d = r0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        aq.a it = (aq.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        zm5.r0 r0Var = this.f555780d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = r0Var.m158354x19263085();
        android.content.Intent intent = new android.content.Intent(r0Var.m80379x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p2776x373aa5.p2777x9d4bf30f.ActivityC22819xd72be816.class);
        intent.putExtra("KEY_CROP_IMAGE_PATH", it.f94360b);
        fn5.n0 O6 = r0Var.O6();
        O6.getClass();
        java.lang.String labelId = it.f94359a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelId, "labelId");
        intent.putParcelableArrayListExtra("KEY_PERSON_IMAGE_LIST", (java.util.ArrayList) ((java.util.LinkedHashMap) O6.f346268u).get(labelId));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m158354x19263085, arrayList.toArray(), "com/tencent/mm/view/activity/ImageQueryMainUIC$initView$1$3", "invoke", "(Lcom/tencent/mm/data/CropImageItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m158354x19263085.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(m158354x19263085, "com/tencent/mm/view/activity/ImageQueryMainUIC$initView$1$3", "invoke", "(Lcom/tencent/mm/data/CropImageItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        f65.o.f341445a.c(55);
        return jz5.f0.f384359a;
    }
}
