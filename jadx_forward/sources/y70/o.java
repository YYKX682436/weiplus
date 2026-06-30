package y70;

/* loaded from: classes12.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f541222e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, y70.p pVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f541221d = str;
        this.f541222e = bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashMap b17 = v70.b0.f515133m.b();
        java.lang.String str = this.f541221d;
        java.util.HashSet hashSet = (java.util.HashSet) b17.get(str);
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                android.widget.ImageView imageView = (android.widget.ImageView) ((d75.c) next).get();
                if (imageView == null) {
                    it.remove();
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(imageView.getTag(com.p314xaae8f345.mm.R.id.h9z), str)) {
                    android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    int i17 = layoutParams != null ? layoutParams.width : 0;
                    android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                    int i18 = layoutParams2 != null ? layoutParams2.height : 0;
                    imageView.setImageBitmap(this.f541222e);
                    imageView.setBackgroundDrawable(null);
                    java.lang.Object tag = imageView.getTag(com.p314xaae8f345.mm.R.id.uhz);
                    if (tag != null) {
                        android.view.View view = tag instanceof android.view.View ? (android.view.View) tag : null;
                        if (view != null) {
                            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, i18));
                        }
                    }
                    java.lang.Object tag2 = imageView.getTag(com.p314xaae8f345.mm.R.id.f567528ui0);
                    if (tag2 != null) {
                        android.view.View view2 = tag2 instanceof android.view.View ? (android.view.View) tag2 : null;
                        if (view2 != null) {
                            view2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, i18));
                        }
                    }
                }
            }
            if (hashSet.isEmpty()) {
                v70.b0.f515133m.b().remove(str);
            }
        }
        return jz5.f0.f384359a;
    }
}
