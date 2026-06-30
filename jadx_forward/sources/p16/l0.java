package p16;

/* loaded from: classes16.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Stack f432853a = new java.util.Stack();

    public l0(p16.k0 k0Var) {
    }

    public final void a(p16.g gVar) {
        if (!gVar.k()) {
            if (gVar instanceof p16.o0) {
                p16.o0 o0Var = (p16.o0) gVar;
                a(o0Var.f432865f);
                a(o0Var.f432866g);
                return;
            } else {
                java.lang.String valueOf = java.lang.String.valueOf(gVar.getClass());
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 49);
                sb6.append("Has a new type of ByteString been created? Found ");
                sb6.append(valueOf);
                throw new java.lang.IllegalArgumentException(sb6.toString());
            }
        }
        int mo157707x35e001 = gVar.mo157707x35e001();
        int[] iArr = p16.o0.f432863n;
        int binarySearch = java.util.Arrays.binarySearch(iArr, mo157707x35e001);
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int i17 = iArr[binarySearch + 1];
        java.util.Stack stack = this.f432853a;
        if (stack.isEmpty() || ((p16.g) stack.peek()).mo157707x35e001() >= i17) {
            stack.push(gVar);
            return;
        }
        int i18 = iArr[binarySearch];
        p16.g gVar2 = (p16.g) stack.pop();
        while (!stack.isEmpty() && ((p16.g) stack.peek()).mo157707x35e001() < i18) {
            gVar2 = new p16.o0((p16.g) stack.pop(), gVar2);
        }
        p16.o0 o0Var2 = new p16.o0(gVar2, gVar);
        while (!stack.isEmpty()) {
            int[] iArr2 = p16.o0.f432863n;
            int binarySearch2 = java.util.Arrays.binarySearch(iArr2, o0Var2.f432864e);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((p16.g) stack.peek()).mo157707x35e001() >= iArr2[binarySearch2 + 1]) {
                break;
            } else {
                o0Var2 = new p16.o0((p16.g) stack.pop(), o0Var2);
            }
        }
        stack.push(o0Var2);
    }
}
