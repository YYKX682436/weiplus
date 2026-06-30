package fq0;

/* loaded from: classes7.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.x f347008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d f347009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(fq0.x xVar, com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d) {
        super(0);
        this.f347008d = xVar;
        this.f347009e = c10867x3e50a04d;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fq0.x xVar = this.f347008d;
        hq0.e0 e0Var = xVar.f347012c;
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = this.f347009e;
        if (e0Var != null) {
            hq0.k0 k0Var = e0Var.f364521i.f364531m;
            k0Var.getClass();
            java.lang.String frameSetId = xVar.f347011b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
            java.util.Collection values = k0Var.f364561a.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : values) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((hq0.j0) obj).f364546b, frameSetId)) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                android.view.View view = ((hq0.j0) it.next()).f364551g;
                if (view != null) {
                    arrayList2.add(view);
                }
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                android.view.View view2 = (android.view.View) it6.next();
                android.view.ViewParent parent = view2.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view2);
                }
                if (c10867x3e50a04d != null) {
                    c10867x3e50a04d.addView(view2, view2.getLayoutParams());
                }
            }
        }
        android.view.ViewParent parent2 = c10867x3e50a04d != null ? c10867x3e50a04d.getParent() : null;
        android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
        if (viewGroup2 != null) {
            viewGroup2.setClipChildren(xVar.f347019j);
        }
        android.view.ViewGroup.LayoutParams layoutParams = c10867x3e50a04d != null ? c10867x3e50a04d.getLayoutParams() : null;
        int i17 = xVar.f347015f;
        if (i17 > 0 && layoutParams != null) {
            layoutParams.width = vp0.b.b(java.lang.Integer.valueOf(i17));
        }
        int i18 = xVar.f347016g;
        if (i18 > 0 && layoutParams != null) {
            layoutParams.height = vp0.b.b(java.lang.Integer.valueOf(i18));
        }
        if (c10867x3e50a04d != null) {
            c10867x3e50a04d.setLayoutParams(layoutParams);
        }
        return jz5.f0.f384359a;
    }
}
