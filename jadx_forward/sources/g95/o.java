package g95;

/* loaded from: classes9.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f351347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f351348f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f351349g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, java.util.List list, int i17, int i18) {
        super(0);
        this.f351346d = str;
        this.f351347e = list;
        this.f351348f = i17;
        this.f351349g = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        ez.j jVar = (ez.j) g95.u.f351354a.e();
        java.lang.String str = this.f351346d;
        g15.b wi6 = jVar.wi(str);
        if (wi6 == null) {
            wi6 = new g15.b();
        }
        java.util.LinkedList j17 = wi6.j();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = j17.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i17 = this.f351348f;
            if (!hasNext) {
                break;
            }
            java.lang.Object next = it.next();
            if (((g15.a) next).k() == i17) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((g15.a) it6.next()).l()));
        }
        java.util.Set X0 = kz5.n0.X0(arrayList2);
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.f9> list = this.f351347e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            arrayList3.add(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it7.next()).m124847x74d37ac6()));
        }
        java.util.Set X02 = kz5.n0.X0(arrayList3);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(X0, X02)) {
            kz5.n0.g0(X02, ", ", null, null, 0, null, null, 62, null);
        } else {
            wi6.j().removeIf(new g95.n(i17));
            java.util.LinkedList j18 = wi6.j();
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : list) {
                g15.a aVar = new g15.a();
                aVar.q(f9Var.m124847x74d37ac6());
                aVar.p(i17);
                aVar.n(this.f351349g);
                aVar.o(f9Var.mo78012x3fdd41df());
                arrayList4.add(aVar);
            }
            j18.addAll(arrayList4);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replace, [");
            sb6.append(str);
            sb6.append(", ");
            sb6.append(i17);
            sb6.append("], ");
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList5.add(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it8.next()).m124847x74d37ac6()));
            }
            sb6.append(arrayList5);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvRedHintStorage", sb6.toString());
            g95.u.f351354a.n(str, wi6);
        }
        return jz5.f0.f384359a;
    }
}
