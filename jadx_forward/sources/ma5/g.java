package ma5;

/* loaded from: classes15.dex */
public class g extends n3.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ma5.k f406776a;

    public g(ma5.k kVar) {
        this.f406776a = kVar;
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        android.view.View view2;
        ma5.k kVar = this.f406776a;
        if (kVar.f406800o && (view2 = kVar.f406792g) != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            view2.setTranslationY(0.0f);
            kVar.f406789d.setTranslationY(0.0f);
        }
        kVar.f406789d.setVisibility(8);
        kVar.f406789d.m2597x1acfd12b(false);
        kVar.f406805t = null;
        n.a aVar = kVar.f406796k;
        if (aVar != null) {
            aVar.d(kVar.f406795j);
            kVar.f406795j = null;
            kVar.f406796k = null;
        }
    }
}
