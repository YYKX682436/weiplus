package ty2;

/* loaded from: classes9.dex */
public final class d extends ty2.b {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f504595d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f504596e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, ty2.z config) {
        super(context, ty2.q.f504638e, config);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787(context);
        this.f504595d = c1073x7e08a787;
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f504596e = imageView;
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView.setBackgroundColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, 0);
        layoutParams.f92426h = 0;
        layoutParams.f92432k = 0;
        layoutParams.B = "V,1:1";
        c1073x7e08a787.addView(imageView, layoutParams);
    }

    @Override // ty2.b
    public android.view.View b(bw5.q5 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.util.LinkedList linkedList = item.f113476f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getImgUrls(...)");
        java.lang.String str = (java.lang.String) kz5.n0.a0(linkedList, 0);
        if (str == null) {
            str = "";
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        g1Var.f().c(((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), this.f504596e, g1Var.h(mn2.f1.f411486d));
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a(), "coverUrl is empty");
        }
        return this.f504595d;
    }
}
