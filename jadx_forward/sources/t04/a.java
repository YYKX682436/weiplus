package t04;

/* loaded from: classes4.dex */
public final class a extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f496056d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.z60 f496057e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f496058f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f496059g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f496056d = "MicroMsg.SecData.SecDataUIC";
        this.f496057e = new r45.z60();
        this.f496058f = new java.util.HashMap();
        this.f496059g = new java.util.HashMap();
    }

    public final o04.n O6(int i17) {
        java.lang.Object obj = this.f496059g.get(java.lang.Integer.valueOf(i17));
        if (obj instanceof o04.n) {
            return (o04.n) obj;
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p2495xc50a8b8b.f P6(int i17, int i18, java.lang.Class clazz) {
        r45.y60 y60Var;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        java.util.LinkedList linkedList2 = this.f496057e.f473278d;
        if (!(linkedList2.size() > i17)) {
            linkedList2 = null;
        }
        if (linkedList2 != null && (y60Var = (r45.y60) linkedList2.get(i17)) != null && (linkedList = y60Var.f472356i) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.a70) obj).f451333d == i18) {
                    break;
                }
            }
            r45.a70 a70Var = (r45.a70) obj;
            if (a70Var != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) clazz.newInstance();
                fVar.mo11468x92b714fd(a70Var.f451334e.g());
                return fVar;
            }
        }
        return null;
    }

    public final o04.o Q6(int i17) {
        return (o04.o) this.f496058f.get(java.lang.Integer.valueOf(i17));
    }

    public final void R6(android.content.Intent intent) {
        jz5.f0 f0Var;
        this.f496058f.clear();
        this.f496059g.clear();
        r45.z60 z60Var = this.f496057e;
        z60Var.f473278d.clear();
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("ReportKey.CommonReportObjKey");
            if (byteArrayExtra != null) {
                z60Var.mo11468x92b714fd(byteArrayExtra);
            }
        } catch (java.lang.Exception unused) {
        }
        r45.y60 y60Var = new r45.y60();
        y60Var.f472351d = m158354x19263085().getClass().getSimpleName();
        y60Var.f472353f = c01.id.c();
        java.util.LinkedList List = z60Var.f473278d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(List, "List");
        r45.y60 y60Var2 = (r45.y60) kz5.n0.Z(List);
        java.lang.String str = this.f496056d;
        if (y60Var2 != null) {
            y60Var.f472352e = y60Var2.f472352e;
            y60Var.f472354g = y60Var2.f472354g;
            y60Var.f472355h = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "fromPage:" + y60Var2.f472351d + " contextId:" + y60Var2.f472352e + " currentPage:" + y60Var.f472351d);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            y60Var.f472352e = java.util.UUID.randomUUID().toString();
            y60Var.f472354g = 0;
            y60Var.f472355h = 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "firstPage:" + y60Var.f472351d + " contextId:" + y60Var.f472352e);
        }
        z60Var.f473278d.addFirst(y60Var);
        if (z60Var.f473278d.size() > 5) {
            z60Var.f473278d.removeLast();
        }
    }

    public final void S6(o04.n secData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(secData, "secData");
        this.f496059g.put(java.lang.Integer.valueOf(((o04.g) secData).f423441a), secData);
    }

    public final void T6(o04.o secData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(secData, "secData");
        this.f496058f.put(java.lang.Integer.valueOf(secData.mo150337xfb85f7b0()), secData);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        super.mo2277xb2f1ab1a(bundle);
        R6(m158359x1e885992());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onNewIntent */
    public void mo2280xc944513d(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f496056d, "onNewIntent " + intent);
        if (intent != null) {
            if (!intent.getBooleanExtra("ReportKey.CommonReportNewIntentClearKey", false)) {
                intent = null;
            }
            if (intent != null) {
                R6(intent);
                return;
            }
        }
        android.content.Intent m158359x1e885992 = m158359x1e885992();
        android.content.Intent intent2 = m158359x1e885992.getBooleanExtra("ReportKey.CommonReportNewIntentClearKey", false) ? m158359x1e885992 : null;
        if (intent2 != null) {
            R6(intent2);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onStartActivityForResult */
    public void mo14640xb30cf874(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        r45.z60 z60Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.LinkedList linkedList3;
        java.lang.String str = this.f496056d;
        try {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.HashMap hashMap = this.f496058f;
            java.util.Collection values = hashMap.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            java.util.Iterator it = values.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                z60Var = this.f496057e;
                if (!hasNext) {
                    break;
                }
                o04.o oVar = (o04.o) it.next();
                if (oVar.b(intent)) {
                    r45.a70 a70Var = new r45.a70();
                    a70Var.f451333d = oVar.mo150337xfb85f7b0();
                    a70Var.f451334e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(oVar.c().mo14344x5f01b1f6());
                    java.util.LinkedList List = z60Var.f473278d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(List, "List");
                    r45.y60 y60Var = (r45.y60) kz5.n0.Z(List);
                    if (y60Var != null && (linkedList3 = y60Var.f472356i) != null) {
                        linkedList3.add(a70Var);
                    }
                    if (!oVar.a()) {
                        hashSet.add(java.lang.Integer.valueOf(oVar.mo150337xfb85f7b0()));
                    }
                }
            }
            java.util.Iterator it6 = hashSet.iterator();
            while (it6.hasNext()) {
                hashMap.remove(java.lang.Integer.valueOf(((java.lang.Number) it6.next()).intValue()));
            }
            byte[] mo14344x5f01b1f6 = z60Var.mo14344x5f01b1f6();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("onStartActivityForResult SubObjList.size:");
            java.util.LinkedList List2 = z60Var.f473278d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(List2, "List");
            r45.y60 y60Var2 = (r45.y60) kz5.n0.Z(List2);
            sb6.append((y60Var2 == null || (linkedList2 = y60Var2.f472356i) == null) ? null : java.lang.Integer.valueOf(linkedList2.size()));
            sb6.append(", requestCode:");
            sb6.append(i17);
            sb6.append(" options:");
            sb6.append(bundle);
            sb6.append(" byteSize:");
            sb6.append(mo14344x5f01b1f6.length);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            if (mo14344x5f01b1f6.length > 262144) {
                int length = mo14344x5f01b1f6.length;
                java.util.LinkedList List3 = z60Var.f473278d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(List3, "List");
                r45.y60 y60Var3 = (r45.y60) kz5.n0.Z(List3);
                if (y60Var3 != null) {
                    List3.clear();
                    List3.add(y60Var3);
                }
                mo14344x5f01b1f6 = z60Var.mo14344x5f01b1f6();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "data size large than 256KB origin:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.g0(length, 2.0d) + " current:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.g0(mo14344x5f01b1f6.length, 2.0d));
            }
            if (mo14344x5f01b1f6.length >= 262144) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "data size two large");
            } else if (intent != null) {
                intent.putExtra("ReportKey.CommonReportObjKey", mo14344x5f01b1f6);
            }
            java.util.LinkedList List4 = z60Var.f473278d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(List4, "List");
            r45.y60 y60Var4 = (r45.y60) kz5.n0.Z(List4);
            if (y60Var4 == null || (linkedList = y60Var4.f472356i) == null) {
                return;
            }
            linkedList.clear();
        } catch (java.lang.Exception unused) {
        }
    }
}
