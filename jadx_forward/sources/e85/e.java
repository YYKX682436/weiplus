package e85;

/* loaded from: classes10.dex */
public final class e implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public static final e85.e f331839d = new e85.e();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message msg) {
        d85.f0 f0Var;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274719i;
        synchronized (linkedList) {
            d85.f0 f0Var2 = null;
            r5 = null;
            d85.f0 f0Var3 = null;
            f0Var2 = null;
            if (!(msg.obj instanceof e85.c)) {
                msg = null;
            }
            if (msg != null) {
                java.lang.Object obj = msg.obj;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.sensitive.business.BusinessStackRecorder.MsgData");
                e85.c cVar = (e85.c) obj;
                java.lang.String str = cVar.f331831a;
                e85.b bVar = com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER")) {
                    java.util.LinkedList linkedList2 = linkedList.contains(cVar) ^ true ? linkedList : null;
                    if (linkedList2 != null) {
                        linkedList2.add(cVar);
                    }
                    java.lang.String str2 = cVar.f331836f;
                    if ((str2.length() > 0) == false) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = (java.lang.String) com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274717g.get(cVar.f331832b);
                    }
                    if (str2 != null) {
                        try {
                            d85.f0[] m123703xcee59d22 = d85.f0.m123703xcee59d22();
                            int length = m123703xcee59d22.length;
                            while (true) {
                                if (r9 >= length) {
                                    break;
                                }
                                d85.f0 f0Var4 = m123703xcee59d22[r9];
                                if (r26.i0.p(f0Var4.f308709d, str2, true)) {
                                    f0Var3 = f0Var4;
                                    break;
                                }
                                r9++;
                            }
                        } catch (java.lang.IllegalArgumentException unused) {
                        }
                        if (f0Var3 != null) {
                            cVar.f331837g = f0Var3;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BusinessStackRecorder", "enter business:" + f0Var3);
                            com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274720m.add(cVar);
                            e85.b.a(bVar);
                        }
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "com.tencent.mm.sensitive.SENSITIVE_PAGE_RESUME")) {
                    java.util.LinkedList linkedList3 = linkedList.contains(cVar) ^ true ? linkedList : null;
                    if (linkedList3 != null) {
                        linkedList3.add(cVar);
                    }
                    java.lang.String str3 = cVar.f331836f;
                    if ((str3.length() > 0) == false) {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = (java.lang.String) com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274717g.get(cVar.f331832b);
                    }
                    if (str3 != null) {
                        try {
                            d85.f0[] m123703xcee59d222 = d85.f0.m123703xcee59d22();
                            int length2 = m123703xcee59d222.length;
                            for (int i18 = 0; i18 < length2; i18++) {
                                f0Var = m123703xcee59d222[i18];
                                if (r26.i0.p(f0Var.f308709d, str3, true)) {
                                    break;
                                }
                            }
                        } catch (java.lang.IllegalArgumentException unused2) {
                        }
                        f0Var = null;
                        if (f0Var != null) {
                            cVar.f331837g = f0Var;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BusinessStackRecorder", "resume business:" + f0Var);
                            java.util.LinkedList linkedList4 = com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274720m;
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kz5.n0.k0(linkedList4), cVar)) {
                                java.util.ListIterator listIterator = linkedList4.listIterator(linkedList4.size());
                                while (true) {
                                    if (!listIterator.hasPrevious()) {
                                        i17 = -1;
                                        break;
                                    }
                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((e85.c) listIterator.previous()).f331832b, cVar.f331832b)) {
                                        i17 = listIterator.nextIndex();
                                        break;
                                    }
                                }
                                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                                java.lang.Integer num = (valueOf.intValue() != -1 ? 1 : 0) != 0 ? valueOf : null;
                                if (num != null) {
                                    int intValue = num.intValue();
                                    e85.b bVar2 = com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BusinessStackRecorder", "already exist，move to Top");
                                    java.util.LinkedList linkedList5 = com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274720m;
                                    linkedList5.remove(intValue);
                                    linkedList5.add(cVar);
                                } else {
                                    e85.b bVar3 = com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BusinessStackRecorder", "resume not exist，do nothing");
                                }
                            } else {
                                linkedList4.add(cVar);
                                e85.b.a(bVar);
                            }
                        }
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT")) {
                    linkedList.remove(cVar);
                    java.lang.String str4 = cVar.f331836f;
                    if ((str4.length() > 0) == false) {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str4 = (java.lang.String) com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274717g.get(cVar.f331832b);
                    }
                    if (str4 != null) {
                        try {
                            d85.f0[] m123703xcee59d223 = d85.f0.m123703xcee59d22();
                            int length3 = m123703xcee59d223.length;
                            while (true) {
                                if (r9 >= length3) {
                                    break;
                                }
                                d85.f0 f0Var5 = m123703xcee59d223[r9];
                                if (r26.i0.p(f0Var5.f308709d, str4, true)) {
                                    f0Var2 = f0Var5;
                                    break;
                                }
                                r9++;
                            }
                        } catch (java.lang.IllegalArgumentException unused3) {
                        }
                        if (f0Var2 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BusinessStackRecorder", "exit business:" + f0Var2);
                            pm0.v.d0(com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274720m, new e85.d(cVar));
                            e85.b.a(bVar);
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BusinessStackRecorder", "handle illegal msg, do nothing");
                }
            }
        }
        return true;
    }
}
