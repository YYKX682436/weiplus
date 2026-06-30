package n3;

/* loaded from: classes14.dex */
public class j3 extends n3.i3 {
    @Override // n3.l3
    public boolean b() {
        return (this.f415872a.getDecorView().getSystemUiVisibility() & 16) != 0;
    }

    @Override // n3.l3
    public void d(boolean z17) {
        if (!z17) {
            i(16);
            return;
        }
        android.view.Window window = this.f415872a;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        h(16);
    }
}
