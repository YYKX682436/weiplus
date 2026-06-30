package zt;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f557065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f557066e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, zt.e eVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f557065d = str;
        this.f557066e = bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.g gVar = ot.g.f429841m;
        java.util.HashMap hashMap = (java.util.HashMap) ((jz5.n) ot.g.f429841m).mo141623x754a37bb();
        java.lang.String str = this.f557065d;
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
                    imageView.setImageBitmap(this.f557066e);
                    imageView.setBackgroundDrawable(null);
                }
            }
            if (hashSet.isEmpty()) {
                jz5.g gVar2 = ot.g.f429841m;
                ((java.util.HashMap) ((jz5.n) ot.g.f429841m).mo141623x754a37bb()).remove(str);
            }
        }
        return jz5.f0.f384359a;
    }
}
