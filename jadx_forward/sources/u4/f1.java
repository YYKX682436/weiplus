package u4;

/* loaded from: classes13.dex */
public class f1 implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 f506008d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f506009e;

    public f1(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975, android.view.ViewGroup viewGroup) {
        this.f506008d = abstractC1183x100d4975;
        this.f506009e = viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d9 A[EDGE_INSN: B:129:0x01d9->B:130:0x01d9 BREAK  A[LOOP:1: B:17:0x0083->B:29:0x01d0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.f1.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        android.view.ViewGroup viewGroup = this.f506009e;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        u4.g1.f506013c.remove(viewGroup);
        java.util.ArrayList arrayList = (java.util.ArrayList) u4.g1.b().m174751x4aabfc28(viewGroup, null);
        if (arrayList != null && arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) it.next()).G(viewGroup);
            }
        }
        this.f506008d.l(true);
    }
}
