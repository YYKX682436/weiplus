package lm5;

/* loaded from: classes7.dex */
public class c extends lm5.d {
    public c() {
        jm5.b.c("Vending.NoLooperScheduler", "This is not a handler thread! %s", java.lang.Thread.currentThread());
    }

    @Override // lm5.d
    public void a(java.lang.Runnable runnable) {
        jm5.b.c("Vending.NoLooperScheduler", "This is not a handler thread!", new java.lang.Object[0]);
        runnable.run();
    }

    @Override // lm5.d
    public void b(java.lang.Runnable runnable, long j17) {
        jm5.b.c("Vending.NoLooperScheduler", "This is not a handler thread!", new java.lang.Object[0]);
        runnable.run();
    }

    @Override // lm5.d
    public void c() {
    }

    @Override // lm5.d
    public java.lang.String d() {
        return java.lang.Thread.currentThread().toString();
    }
}
