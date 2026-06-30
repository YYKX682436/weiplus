package cl;

/* loaded from: classes7.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124139d;

    public c1(cl.q0 q0Var) {
        this.f124139d = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = false;
        boolean z18 = true;
        if (this.f124139d.f() != null) {
            try {
                com.p159x477cd522.p160x333422.C1477x4679881 mo16386x31ca9f38 = this.f124139d.f().mo16386x31ca9f38();
                com.p159x477cd522.p160x333422.C1477x4679881 mo16330x2817c635 = mo16386x31ca9f38.mo16330x2817c635("v8Console");
                if (mo16330x2817c635 == null || mo16330x2817c635.mo16336x85ca346()) {
                    mo16330x2817c635 = mo16386x31ca9f38.mo16330x2817c635("console");
                }
                java.lang.String str = this.f124139d.f124256a;
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = (mo16330x2817c635 == null || mo16330x2817c635.mo16336x85ca346()) ? "fail" : "ok";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initApi, save Inspector console %s", objArr);
                this.f124139d.f124264i = mo16330x2817c635;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.J2V8.V8ContextEngine", "get OriginConsole ex: %s", th6.getMessage());
            }
        }
        if (((cl.a) this.f124139d.f124257b).f124122v.f135491p || cl.q0.f124255l != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.J2V8.V8ContextEngine", "initApi, inject V8DirectApiConsole");
            java.util.LinkedList linkedList = this.f124139d.f124261f;
            cl.c2 c2Var = new cl.c2();
            c2Var.b(this.f124139d);
            linkedList.add(c2Var);
        }
        cl.q0 q0Var = this.f124139d;
        cl.p pVar = q0Var.f124257b;
        if ((pVar instanceof cl.e0) && ((cl.a) pVar).f124122v.f135493r) {
            q0Var.f().mo16380xcb4354d4("var global = (function() { return this; })();", new cl.k1());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.J2V8.V8ContextEngine", "[no-node] injected global polyfill");
        }
        cl.q0 q0Var2 = this.f124139d;
        cl.p pVar2 = q0Var2.f124257b;
        if ((pVar2 instanceof cl.e0) && ((cl.a) pVar2).f124122v.f135493r) {
            cl.e0 e0Var = (cl.e0) pVar2;
            long e17 = q0Var2.e();
            if (e17 == 0) {
                e0Var.getClass();
            } else if (e17 == e0Var.E) {
                z17 = true;
            }
            z18 = true ^ z17;
        }
        if (z18) {
            sk1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.mm.p2809x52b77bcb.C22921x2bd339e4 c22921x2bd339e4 = new com.p314xaae8f345.mm.p2809x52b77bcb.C22921x2bd339e4();
            c22921x2bd339e4.m83356xad361398(((cl.a) this.f124139d.f124257b).f124101a.m15872xc2f94e39(), this.f124139d.e());
            cl.q0 q0Var3 = this.f124139d;
            q0Var3.f124262g = c22921x2bd339e4;
            java.util.LinkedList linkedList2 = q0Var3.f124261f;
            cl.w2 w2Var = new cl.w2();
            w2Var.b(this.f124139d);
            linkedList2.add(w2Var);
        }
        cl.q0 q0Var4 = this.f124139d;
        java.util.LinkedList linkedList3 = q0Var4.f124261f;
        cl.n2 n2Var = new cl.n2();
        n2Var.b(q0Var4);
        linkedList3.add(n2Var);
        cl.q0 q0Var5 = this.f124139d;
        com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0 c5138xafbea1a0 = ((cl.a) q0Var5.f124257b).f124122v;
        if (q0Var5.f124258c.mo15021xa0ce6f6a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.J2V8.V8ContextEngine", "[v8] [dl: ] [nativebuffer] use NativeBufferJNI");
            cl.q0 q0Var6 = this.f124139d;
            q0Var6.f124258c.mo15016x2418f779(((cl.a) q0Var6.f124257b).f124101a.m15872xc2f94e39(), this.f124139d.e());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.J2V8.V8ContextEngine", "[v8] [dl: ] [nativebuffer] use V8DirectApi");
            cl.q0 q0Var7 = this.f124139d;
            java.util.LinkedList linkedList4 = q0Var7.f124261f;
            cl.v1 v1Var = new cl.v1(q0Var7.f124258c);
            v1Var.b(q0Var7);
            linkedList4.add(v1Var);
        }
        cl.q0 q0Var8 = this.f124139d;
        java.util.LinkedList linkedList5 = q0Var8.f124261f;
        cl.h2 h2Var = new cl.h2(q0Var8.f124259d, q0Var8.f124260e);
        h2Var.b(q0Var8);
        linkedList5.add(h2Var);
    }
}
