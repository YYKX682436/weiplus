package nf4;

/* loaded from: classes4.dex */
public final class a extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f418369e = {l75.n0.m145250x3fdc6f77(nf4.b.f418372z, "StoryCommentSync")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f418370f = "select * from StoryCommentSync";

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f418371d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l75.k0 db6) {
        super(db6, nf4.b.f418372z, "StoryCommentSync", dm.bb.f317462n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f418371d = db6;
        java.util.List asList = java.util.Arrays.asList(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asList, "asList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(asList);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it6 = hashSet.iterator();
            while (it6.hasNext()) {
                int intValue = ((java.lang.Integer) it6.next()).intValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                arrayList3.add(java.lang.Integer.valueOf(intValue | num.intValue()));
            }
            hashSet.addAll(new java.util.HashSet(arrayList3));
            hashSet.add(num);
        }
        hashSet.add(0);
        arrayList2.addAll(hashSet);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            java.lang.Integer num2 = (java.lang.Integer) it7.next();
            if ((num2.intValue() & 1) != 0) {
                arrayList4.add(num2);
            }
        }
        nf4.l.f418391m.a(arrayList4, "commentFlag");
    }

    public final java.util.List y0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor B = this.f418371d.B(f418370f, null);
        if (B != null) {
            while (B.moveToNext()) {
                nf4.b bVar = new nf4.b();
                bVar.mo9015xbf5d97fd(B);
                arrayList.add(bVar);
            }
            B.close();
        }
        return arrayList;
    }

    public final nf4.b z0(long j17) {
        nf4.b bVar = null;
        android.database.Cursor B = this.f418371d.B("select * from StoryCommentSync  where storyId = " + j17 + ' ', null);
        if (B != null) {
            if (B.moveToFirst()) {
                nf4.b bVar2 = new nf4.b();
                bVar2.mo9015xbf5d97fd(B);
                bVar = bVar2;
            }
            B.close();
        }
        return bVar;
    }
}
