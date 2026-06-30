package c20;

/* loaded from: classes9.dex */
public final class e extends y10.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.content.Context c17 = context.c();
        if (c17 != null) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = c17 instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) c17 : null;
            if (appCompatActivity != null) {
                kotlinx.coroutines.l.d(androidx.lifecycle.z.a(appCompatActivity), null, null, new c20.d(jumpInfo, c17, callback, null), 3, null);
            }
        }
    }
}
