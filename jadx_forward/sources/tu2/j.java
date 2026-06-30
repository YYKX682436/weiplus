package tu2;

/* loaded from: classes.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final tu2.j f503676d = new tu2.j();

    public j() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        if (activity == null) {
            db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "退出页面再重试下", 0).show();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("TITLE", "通用选择器");
            intent.putExtra("BIZ_SCENE", 1);
            byte[] bytes = "{\"status_id\":\"1000\",\"status_tags\":[\"1888\"],\"status_word\":\"美滋滋\",\"status_description\":\"#1888\"}".getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            intent.putExtra("EXT_BUFF", bytes);
            java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(5);
            intent.putIntegerArrayListExtra("TAB_LIST", arrayList);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).yj(activity, intent, 0);
        }
        return jz5.f0.f384359a;
    }
}
