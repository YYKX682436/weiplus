package zy2;

/* loaded from: classes10.dex */
public final class b5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f558884a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.CheckBox f558885b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f558886c;

    public b5(android.view.View root, android.widget.CheckBox checkBox, android.widget.ImageView thumbIv) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checkBox, "checkBox");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbIv, "thumbIv");
        this.f558884a = root;
        this.f558885b = checkBox;
        this.f558886c = thumbIv;
    }

    /* renamed from: equals */
    public boolean m179927xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.b5)) {
            return false;
        }
        zy2.b5 b5Var = (zy2.b5) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558884a, b5Var.f558884a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558885b, b5Var.f558885b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558886c, b5Var.f558886c);
    }

    /* renamed from: hashCode */
    public int m179928x8cdac1b() {
        return (((this.f558884a.hashCode() * 31) + this.f558885b.hashCode()) * 31) + this.f558886c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179929x9616526c() {
        return "FinderMsgHistoryGalleryMediaItemViews(root=" + this.f558884a + ", checkBox=" + this.f558885b + ", thumbIv=" + this.f558886c + ')';
    }
}
