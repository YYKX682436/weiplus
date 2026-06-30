package c01;

/* loaded from: classes11.dex */
public class k7 implements c01.p8, c01.l8 {

    /* renamed from: a, reason: collision with root package name */
    public final c01.p8 f37286a;

    public k7(c01.p8 p8Var) {
        this.f37286a = p8Var;
    }

    @Override // c01.p8
    public void a(java.lang.String str, java.lang.String str2, int i17) {
        java.util.Iterator it = c01.j7.f37268a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
        java.util.Iterator it6 = ((fs.c) fs.g.f(c01.rb.class)).all().iterator();
        while (it6.hasNext()) {
            c01.rb rbVar = (c01.rb) ((fs.q) it6.next()).get();
            if (rbVar.sh(str, i17)) {
                rbVar.be().a(str, str2, i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.GetContactServiceProxy", "[addContact] has consume. interceptor=%s", rbVar);
                return;
            }
        }
        this.f37286a.a(str, str2, i17);
    }

    @Override // c01.p8
    public void b(java.lang.String str, int i17, c01.o8 o8Var) {
        java.util.Iterator it = c01.j7.f37268a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
        java.util.Iterator it6 = ((fs.c) fs.g.f(c01.rb.class)).all().iterator();
        while (it6.hasNext()) {
            c01.rb rbVar = (c01.rb) ((fs.q) it6.next()).get();
            if (rbVar.sh(str, i17)) {
                rbVar.be().b(str, i17, o8Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.GetContactServiceProxy", "[getNow] has consume. interceptor=%s", rbVar);
                return;
            }
        }
        this.f37286a.b(str, i17, o8Var);
    }

    @Override // c01.p8
    public void d() {
        this.f37286a.d();
    }

    @Override // c01.p8
    public void e(java.lang.String str) {
        java.util.Iterator it = c01.j7.f37268a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
        java.util.Iterator it6 = ((fs.c) fs.g.f(c01.rb.class)).all().iterator();
        while (it6.hasNext()) {
            c01.rb rbVar = (c01.rb) ((fs.q) it6.next()).get();
            if (rbVar.sh(str, 0)) {
                rbVar.be().e(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.GetContactServiceProxy", "[clearMapRecentDown] has consume. interceptor=%s", rbVar);
                return;
            }
        }
        this.f37286a.e(str);
    }

    @Override // c01.p8
    public void f(java.lang.String str) {
        java.util.Iterator it = c01.j7.f37268a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
        java.util.Iterator it6 = ((fs.c) fs.g.f(c01.rb.class)).all().iterator();
        while (it6.hasNext()) {
            c01.rb rbVar = (c01.rb) ((fs.q) it6.next()).get();
            if (rbVar.sh(str, 0)) {
                rbVar.be().f(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.GetContactServiceProxy", "[removeCallBack] has consume. interceptor=%s", rbVar);
                return;
            }
        }
        this.f37286a.f(str);
    }

    @Override // c01.p8
    public void g(java.lang.String str, java.lang.String str2, int i17, c01.o8 o8Var) {
        java.util.Iterator it = c01.j7.f37268a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
        java.util.Iterator it6 = ((fs.c) fs.g.f(c01.rb.class)).all().iterator();
        while (it6.hasNext()) {
            c01.rb rbVar = (c01.rb) ((fs.q) it6.next()).get();
            if (rbVar.sh(str, i17)) {
                rbVar.be().g(str, str2, i17, o8Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.GetContactServiceProxy", "[getNow] has consume. interceptor=%s", rbVar);
                return;
            }
        }
        this.f37286a.g(str, str2, i17, o8Var);
    }

    @Override // c01.p8
    public void h(java.lang.String str, int i17, java.lang.String str2) {
        java.util.Iterator it = c01.j7.f37268a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
        java.util.Iterator it6 = ((fs.c) fs.g.f(c01.rb.class)).all().iterator();
        while (it6.hasNext()) {
            c01.rb rbVar = (c01.rb) ((fs.q) it6.next()).get();
            if (rbVar.sh(str, i17)) {
                rbVar.be().h(str, i17, str2);
                com.tencent.mars.xlog.Log.i("MicroMsg.GetContactServiceProxy", "[addContactExtra] has consume. interceptor=%s", rbVar);
                return;
            }
        }
        this.f37286a.h(str, i17, str2);
    }
}
