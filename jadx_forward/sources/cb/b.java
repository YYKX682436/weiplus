package cb;

/* loaded from: classes13.dex */
public final class b extends cb.c {
    public b(int i17, int i18, android.os.Bundle bundle) {
        super(i17, 2, bundle);
    }

    @Override // cb.c
    public final void c(android.os.Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            a(null);
        } else {
            b(new cb.d(4, "Invalid response to one way request"));
        }
    }

    @Override // cb.c
    public final boolean d() {
        return true;
    }
}
