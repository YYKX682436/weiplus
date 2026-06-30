package n3;

/* loaded from: classes14.dex */
public class i3 extends n3.h3 {
    @Override // n3.l3
    public boolean c() {
        return (this.f415872a.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // n3.l3
    public void e(boolean z17) {
        if (!z17) {
            i(8192);
            return;
        }
        android.view.Window window = this.f415872a;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        h(8192);
    }
}
