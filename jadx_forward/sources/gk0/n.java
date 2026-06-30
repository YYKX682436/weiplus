package gk0;

/* loaded from: classes3.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f353978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, gk0.o oVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f353977d = str;
        this.f353978e = bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gk0.n0.K0.getClass();
        java.util.HashMap hashMap = (java.util.HashMap) ((jz5.n) gk0.m0.f353976b).mo141623x754a37bb();
        java.lang.String str = this.f353977d;
        java.util.HashSet hashSet = (java.util.HashSet) hashMap.get(str);
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
                    imageView.setImageBitmap(this.f353978e);
                }
            }
            if (hashSet.isEmpty()) {
                gk0.n0.K0.getClass();
                ((java.util.HashMap) ((jz5.n) gk0.m0.f353976b).mo141623x754a37bb()).remove(str);
            }
        }
        return jz5.f0.f384359a;
    }
}
