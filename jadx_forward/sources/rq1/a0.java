package rq1;

/* loaded from: classes12.dex */
public class a0 implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        rq1.d0 d0Var = (rq1.d0) obj;
        rq1.d0 d0Var2 = (rq1.d0) obj2;
        short s17 = d0Var.f480259a;
        short s18 = d0Var2.f480259a;
        if (s17 < s18) {
            return -1;
        }
        if (s17 > s18) {
            return 1;
        }
        return d0Var.f480260b - d0Var2.f480260b;
    }
}
