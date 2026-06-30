package af5;

/* loaded from: classes9.dex */
public final class d0 implements af5.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final em.r f4562a;

    public d0(em.r binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f4562a = binding;
    }

    public android.widget.TextView a() {
        em.r rVar = this.f4562a;
        if (rVar.f254740h == null) {
            rVar.f254740h = (com.tencent.mm.ui.widget.MMTextView) rVar.f254733a.findViewById(com.tencent.mm.R.id.ucm);
        }
        com.tencent.mm.ui.widget.MMTextView mMTextView = rVar.f254740h;
        kotlin.jvm.internal.o.f(mMTextView, "getLocationDetail(...)");
        return mMTextView;
    }

    public android.widget.ImageView b() {
        em.r rVar = this.f4562a;
        if (rVar.f254741i == null) {
            rVar.f254741i = (android.widget.ImageView) rVar.f254733a.findViewById(com.tencent.mm.R.id.ucp);
        }
        android.widget.ImageView imageView = rVar.f254741i;
        kotlin.jvm.internal.o.f(imageView, "getLocationMapImage(...)");
        return imageView;
    }

    public android.widget.TextView c() {
        em.r rVar = this.f4562a;
        if (rVar.f254734b == null) {
            rVar.f254734b = (com.tencent.mm.ui.widget.MMTextView) rVar.f254733a.findViewById(com.tencent.mm.R.id.uct);
        }
        com.tencent.mm.ui.widget.MMTextView mMTextView = rVar.f254734b;
        kotlin.jvm.internal.o.f(mMTextView, "getLocationName(...)");
        return mMTextView;
    }
}
