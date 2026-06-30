package tw0;

/* loaded from: classes5.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tw0.i f503957d;

    public d(tw0.i iVar) {
        this.f503957d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tw0.i iVar = this.f503957d;
        iVar.getClass();
        if (!fy0.i.a()) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        int length = iVar.f503976g.length();
        r45.n91 n91Var = iVar.f503979j;
        if (length >= 3) {
            java.lang.String str2 = iVar.f503976g;
            java.lang.String other = iVar.f503975f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<this>");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
            int min = java.lang.Math.min(str2.length(), other.length());
            java.util.ArrayList arrayList = new java.util.ArrayList(min);
            int i17 = 0;
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new jz5.l(java.lang.Character.valueOf(str2.charAt(i18)), java.lang.Character.valueOf(other.charAt(i18))));
            }
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    jz5.l lVar = (jz5.l) it.next();
                    if ((((java.lang.Character) lVar.f384366d).charValue() != ((java.lang.Character) lVar.f384367e).charValue()) && (i19 = i19 + 1) < 0) {
                        kz5.c0.o();
                        throw null;
                    }
                }
                i17 = i19;
            }
            if (i17 + java.lang.Math.abs(str2.length() - other.length()) >= n91Var.m75939xb282bd08(2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecommendTitleService", "tryRequestText: currentText " + iVar.f503976g + " lastText " + iVar.f503975f + ' ');
                iVar.b();
                iVar.f503975f = iVar.f503976g;
                iVar.f503974e = iVar.f503974e + 1;
                p3325xe03a0797.p3326xc267989b.y0 y0Var = iVar.f503977h;
                iVar.f503978i = y0Var != null ? p3325xe03a0797.p3326xc267989b.l.d(y0Var, new p3325xe03a0797.p3326xc267989b.x0("RecommendTitleService_request_" + iVar.f503974e + '}'), null, new tw0.f(iVar, null), 2, null) : null;
            }
        }
        iVar.f503980k.postDelayed(new tw0.d(iVar), n91Var.m75942xfb822ef2(1));
    }
}
