package ee5;

/* loaded from: classes4.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.z f333576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ee5.z zVar) {
        super(1);
        this.f333576d = zVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        aq.a it = (aq.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ee5.z zVar = this.f333576d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = zVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((ee5.e3) pf5.z.f435481a.a(activity).a(ee5.e3.class)).O6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = zVar.m158354x19263085();
        android.content.Intent intent = new android.content.Intent(zVar.m80379x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p2776x373aa5.p2777x9d4bf30f.ActivityC22819xd72be816.class);
        intent.putExtra("KEY_CROP_IMAGE_PATH", it.f94360b);
        fn5.n0 Q6 = zVar.Q6();
        Q6.getClass();
        java.lang.String labelId = it.f94359a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelId, "labelId");
        intent.putParcelableArrayListExtra("KEY_PERSON_IMAGE_LIST", (java.util.ArrayList) ((java.util.LinkedHashMap) Q6.f346268u).get(labelId));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m158354x19263085, arrayList.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageUIC$showImageResultComposeView$1$1", "invoke", "(Lcom/tencent/mm/data/CropImageItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m158354x19263085.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(m158354x19263085, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageUIC$showImageResultComposeView$1$1", "invoke", "(Lcom/tencent/mm/data/CropImageItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f384359a;
    }
}
