package wu;

/* loaded from: classes9.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final wu.m0 f531130d = new wu.m0();

    public m0() {
        super(3);
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str;
        java.lang.String k17;
        hu.b item = (hu.b) obj;
        android.widget.ImageView icon = (android.widget.ImageView) obj2;
        android.widget.TextView title = (android.widget.TextView) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(icon, "icon");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Object[] objArr = new java.lang.Object[1];
        s15.h hVar = item.f366530e;
        s15.k z17 = hVar.z();
        if (z17 == null || (str = z17.m163598x8010e5e4()) == null) {
            str = "";
        }
        objArr[0] = str;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.odl, objArr);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        title.setText(string != null ? string : "");
        s15.k z19 = hVar.z();
        if (z19 != null && (k17 = z19.k()) != null) {
            vo0.a aVar = vo0.e.f520001b;
            yo0.f fVar = new yo0.f();
            fVar.f545611b = true;
            fVar.f545610a = true;
            aVar.c(k17, icon, fVar.a());
        }
        return jz5.f0.f384359a;
    }
}
