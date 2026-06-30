package cc;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes14.dex */
public abstract class c0 implements bc.a {

    /* renamed from: d, reason: collision with root package name */
    public static final cc.c0 f40361d;

    static {
        final java.lang.String str = "VALUE";
        final int i17 = 1;
        f40361d = new cc.c0(str, i17) { // from class: cc.b0
            @Override // bc.a
            public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return ((java.util.Map.Entry) obj).getValue();
            }
        };
    }

    public c0(java.lang.String str, int i17, byte b17) {
    }
}
