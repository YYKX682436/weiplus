package j5;

/* loaded from: classes13.dex */
public class c0 extends l4.w {
    public c0(j5.g0 g0Var, l4.q qVar) {
        super(qVar);
    }

    @Override // l4.w
    public java.lang.String b() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
}
