package rk4;

@j95.b(m140513x1e06fd29 = {e70.q.class})
/* loaded from: classes11.dex */
public final class a extends i95.w implements qk.k6 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f478059d;

    /* renamed from: e, reason: collision with root package name */
    public qk.j6 f478060e;

    public int Ai(qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2) {
        java.util.ArrayList arrayList = this.f478059d;
        if (arrayList == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                return j6Var.a();
            }
        }
        qk.j6 j6Var2 = this.f478060e;
        if (j6Var2 != null) {
            return ((rk4.h) j6Var2).a();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFallbackImpl");
        throw null;
    }

    public qk.ia Bi(qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2) {
        java.util.ArrayList arrayList = this.f478059d;
        if (arrayList == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                return j6Var.i();
            }
        }
        qk.j6 j6Var2 = this.f478060e;
        if (j6Var2 != null) {
            return ((rk4.h) j6Var2).i();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFallbackImpl");
        throw null;
    }

    public org.json.JSONObject Di(bw5.lp0 playingItem, float f17, qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playingItem, "playingItem");
        java.util.ArrayList arrayList = this.f478059d;
        if (arrayList == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                return j6Var.o(playingItem, f17);
            }
        }
        qk.j6 j6Var2 = this.f478060e;
        if (j6Var2 != null) {
            return ((rk4.h) j6Var2).o(playingItem, f17);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFallbackImpl");
        throw null;
    }

    public java.lang.String Ni(int i17, qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2) {
        java.util.ArrayList arrayList = this.f478059d;
        if (arrayList == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                return j6Var.f(i17);
            }
        }
        qk.j6 j6Var2 = this.f478060e;
        if (j6Var2 != null) {
            return ((rk4.h) j6Var2).f(i17);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFallbackImpl");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0064, code lost:
    
        if ((r4.length() > 0) == true) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ri(android.content.Context r13, boolean r14, bw5.lp0 r15, il4.e r16, bw5.o50 r17, android.os.Bundle r18, bw5.ar0 r19, qk.a r20, java.lang.Boolean r21, yz5.a r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.a.Ri(android.content.Context, boolean, bw5.lp0, il4.e, bw5.o50, android.os.Bundle, bw5.ar0, qk.a, java.lang.Boolean, yz5.a, java.lang.String):void");
    }

    public void Ui(java.lang.String taskId, bw5.lp0 item, il4.e ext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        java.util.ArrayList arrayList = this.f478059d;
        if (arrayList == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(null, item.d().m13170xcc16feb8(), item.d(), null)) {
                j6Var.k(taskId, item, ext);
                return;
            }
        }
        qk.j6 j6Var2 = this.f478060e;
        if (j6Var2 != null) {
            ((rk4.h) j6Var2).k(taskId, item, ext);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFallbackImpl");
            throw null;
        }
    }

    public void Vi(bw5.lp0 lp0Var, java.util.List list, bw5.o50 o50Var, bw5.pp0 pp0Var, il4.e ext) {
        bw5.v70 d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        java.util.ArrayList arrayList = this.f478059d;
        if (arrayList == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(null, (lp0Var == null || (d17 = lp0Var.d()) == null) ? null : d17.m13170xcc16feb8(), lp0Var != null ? lp0Var.d() : null, o50Var != null ? o50Var.c() : null)) {
                j6Var.w(lp0Var, list, o50Var, pp0Var, ext);
                return;
            }
        }
        qk.j6 j6Var2 = this.f478060e;
        if (j6Var2 != null) {
            ((rk4.h) j6Var2).w(lp0Var, list, o50Var, pp0Var, ext);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFallbackImpl");
            throw null;
        }
    }

    public bw5.lp0 Zi(qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2) {
        java.util.ArrayList arrayList = this.f478059d;
        if (arrayList == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                return j6Var.b();
            }
        }
        qk.j6 j6Var2 = this.f478060e;
        if (j6Var2 != null) {
            return ((rk4.h) j6Var2).b();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFallbackImpl");
        throw null;
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        this.f478060e = new rk4.h();
        qk.j6[] j6VarArr = new qk.j6[2];
        j6VarArr[0] = new rk4.f();
        qk.j6 j6Var = this.f478060e;
        if (j6Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFallbackImpl");
            throw null;
        }
        j6VarArr[1] = j6Var;
        this.f478059d = kz5.c0.d(j6VarArr);
    }

    public int wi(qk.p9 p9Var, java.lang.String str, bw5.v70 v70Var, java.lang.String str2) {
        java.util.ArrayList arrayList = this.f478059d;
        if (arrayList == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mImplList");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qk.j6 j6Var = (qk.j6) it.next();
            if (j6Var.m(p9Var, str, v70Var, str2)) {
                return j6Var.d();
            }
        }
        qk.j6 j6Var2 = this.f478060e;
        if (j6Var2 != null) {
            return ((rk4.h) j6Var2).d();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFallbackImpl");
        throw null;
    }
}
