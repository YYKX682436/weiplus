package l4;

/* loaded from: classes13.dex */
public abstract class b extends l4.w {
    public abstract void d(p4.i iVar, java.lang.Object obj);

    public final void e(java.lang.Object obj) {
        p4.i a17 = a();
        try {
            d(a17, obj);
            ((q4.i) a17).f441554e.executeInsert();
        } finally {
            c(a17);
        }
    }
}
