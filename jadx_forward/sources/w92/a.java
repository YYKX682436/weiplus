package w92;

/* loaded from: classes2.dex */
public class a extends zx2.k {

    /* renamed from: k, reason: collision with root package name */
    public boolean f525605k;

    /* renamed from: l, reason: collision with root package name */
    public final int f525606l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, java.lang.String title, boolean z17, int i18, int i19) {
        super(title, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f525605k = z17;
        this.f525606l = i18;
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b9w;
    }

    @Override // zx2.i
    public int[] b() {
        return new int[]{0, 24};
    }

    @Override // zx2.k
    public void k(boolean z17) {
        android.widget.TextView textView = this.f558585j;
        if (textView != null) {
            if (this.f525605k) {
                if (z17) {
                    textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231));
                    return;
                } else {
                    textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
                    return;
                }
            }
            if (z17) {
                textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            } else {
                textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            }
        }
    }

    public /* synthetic */ a(int i17, java.lang.String str, boolean z17, int i18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, (i27 & 2) != 0 ? "" : str, z17, (i27 & 8) != 0 ? -1 : i18, (i27 & 16) != 0 ? -1 : i19);
    }
}
