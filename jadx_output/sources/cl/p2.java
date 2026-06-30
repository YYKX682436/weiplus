package cl;

/* loaded from: classes7.dex */
public class p2 implements com.eclipsesource.mmv8.JavaCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cl.w2 f42718b;

    public p2(cl.w2 w2Var, cl.q0 q0Var) {
        this.f42718b = w2Var;
        this.f42717a = q0Var;
    }

    @Override // com.eclipsesource.mmv8.JavaCallback
    public java.lang.Object invoke(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
        int d17;
        com.eclipsesource.mmv8.V8Array newV8Array;
        if (v8Array.length() < 2 || v8Array.getType(0) != 7) {
            com.tencent.mars.xlog.Log.w("MicroMsg.J2V8.V8DirectApiTimer", "setInterval parameters invalid length:%d type[0]:%d", java.lang.Integer.valueOf(v8Array.length()), java.lang.Integer.valueOf(v8Array.getType(0)));
            return null;
        }
        com.eclipsesource.mmv8.V8Function v8Function = (com.eclipsesource.mmv8.V8Function) v8Array.getObject(0);
        if (v8Array.getType(1) == 1) {
            d17 = v8Array.getInteger(1);
        } else if (v8Array.getType(1) == 2) {
            d17 = (int) v8Array.getDouble(1);
        } else {
            if (v8Array.getType(1) != 4) {
                com.tencent.mars.xlog.Log.w("MicroMsg.J2V8.V8DirectApiTimer", "setInterval parameters[1] type:%d", java.lang.Integer.valueOf(v8Array.getType(1)));
                return null;
            }
            d17 = cl.w2.d(v8Array.getString(1), Integer.MIN_VALUE);
            if (d17 == Integer.MIN_VALUE) {
                return null;
            }
        }
        int length = v8Array.length();
        cl.q0 q0Var = this.f42717a;
        if (length > 2) {
            java.util.List<? super java.lang.Object> list = com.eclipsesource.mmv8.utils.V8ObjectUtils.toList(v8Array);
            newV8Array = com.eclipsesource.mmv8.utils.V8ObjectUtils.toV8Array(q0Var.f(), (java.util.List<? extends java.lang.Object>) list.subList(1, list.size()));
        } else {
            newV8Array = q0Var.f().newV8Array();
        }
        com.eclipsesource.mmv8.V8Array v8Array2 = newV8Array;
        cl.w2 w2Var = this.f42718b;
        int i17 = w2Var.f42813b + 1;
        w2Var.f42813b = i17;
        cl.v2 v2Var = q0Var.f42724b instanceof cl.h ? new cl.v2(w2Var, q0Var, i17, v8Function, v8Array2, true, d17) : new cl.t2(w2Var, q0Var, i17, v8Function, v8Array2, true, d17);
        v2Var.e();
        w2Var.f42814c.put(w2Var.f42813b, v2Var);
        return java.lang.Integer.valueOf(w2Var.f42813b);
    }
}
