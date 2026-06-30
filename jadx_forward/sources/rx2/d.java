package rx2;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public int f482501d;

    /* renamed from: e, reason: collision with root package name */
    public int f482502e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f482498a = new java.util.HashMap(5);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f482499b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f482500c = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f482503f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f482504g = new java.util.HashMap();

    public final void a(r45.gb4 gb4Var) {
        if (gb4Var != null) {
            java.util.HashMap hashMap = this.f482498a;
            java.lang.String m75945x2fec8307 = gb4Var.m75945x2fec8307(2);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            hashMap.put(m75945x2fec8307, gb4Var);
        }
    }

    public final void b(java.lang.String curDesc, android.text.Editable s17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curDesc, "curDesc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
        java.util.ArrayList arrayList = this.f482499b;
        arrayList.clear();
        java.util.ArrayList arrayList2 = this.f482500c;
        arrayList2.clear();
        jz5.l i17 = hc2.x0.i(curDesc, this.f482498a, true, new rx2.c(s17));
        arrayList.addAll((java.util.Collection) i17.f384366d);
        arrayList2.addAll((java.util.Collection) i17.f384367e);
        kz5.h0.B(this.f482503f, new rx2.b(this));
    }

    public final java.util.ArrayList c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f482499b;
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            r45.gb4 gb4Var = (r45.gb4) it.next();
            arrayList.add(gb4Var);
            java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f482504g.get(gb4Var.m75945x2fec8307(2));
            if (arrayList3 == null) {
                gb4Var.set(5, 5);
            } else if (arrayList3.size() > 0) {
                java.lang.Object remove = arrayList3.remove(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(remove, "removeAt(...)");
                gb4Var.set(5, java.lang.Integer.valueOf(((java.lang.Number) remove).intValue()));
            }
        }
        return arrayList2;
    }

    public final void d(int i17, java.lang.String nickname) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        this.f482501d++;
        if (i17 != 0) {
            this.f482502e++;
            this.f482503f.add(new jz5.l(nickname, java.lang.Integer.valueOf(i17)));
            java.util.HashMap hashMap = this.f482504g;
            java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(nickname);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            arrayList.add(java.lang.Integer.valueOf(i17));
            hashMap.put(nickname, arrayList);
        }
    }

    public final r45.gb4 e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.C13678x881de345 c13678x881de345) {
        r45.gb4 gb4Var = new r45.gb4();
        gb4Var.set(0, c13678x881de345.f183518d);
        gb4Var.set(1, c13678x881de345.f183519e);
        gb4Var.set(2, c13678x881de345.f183520f);
        gb4Var.set(7, java.lang.Integer.valueOf(c13678x881de345.f183524m));
        byte[] bArr = c13678x881de345.f183521g;
        if (bArr != null) {
            try {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc();
                c19780xceb4c4dc.mo11468x92b714fd(bArr);
                gb4Var.set(3, c19780xceb4c4dc);
            } catch (java.lang.Exception e17) {
                gb4Var.set(3, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderAtManager", "transformToLocalFinderAtContact FinderAuthInfo parseFrom:%s", e17.getMessage());
            }
        }
        gb4Var.set(4, java.lang.Long.valueOf(c13678x881de345.f183522h));
        return gb4Var;
    }
}
