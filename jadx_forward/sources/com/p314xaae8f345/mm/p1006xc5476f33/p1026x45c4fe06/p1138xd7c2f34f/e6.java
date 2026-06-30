package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class e6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l6 f166127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f166128e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l6 l6Var, yz5.l lVar) {
        super(0);
        this.f166127d = l6Var;
        this.f166128e = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j6.f166226b).entrySet()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entry, "<this>");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 q4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4) entry.getValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h4 h4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4.f166590t;
            q4Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l6 stat = this.f166127d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stat, "stat");
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = q4Var.f166602l;
            boolean z17 = false;
            if (!concurrentLinkedQueue.isEmpty()) {
                java.util.Iterator it = concurrentLinkedQueue.iterator();
                while (true) {
                    boolean z18 = true;
                    if (!it.hasNext()) {
                        z17 = true;
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l6 l6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l6) it.next();
                    if (l6Var.f166286a != stat.f166286a) {
                        break;
                    }
                    java.lang.String str = stat.f166287b;
                    if (!(str == null || str.length() == 0) && !u46.l.c(l6Var.f166287b, str)) {
                        break;
                    }
                    java.lang.String str2 = stat.f166288c;
                    if (str2 != null && str2.length() != 0) {
                        z18 = false;
                    }
                    if (!z18 && !u46.l.c(l6Var.f166288c, str2)) {
                        break;
                    }
                }
            }
            if (z17) {
                this.f166128e.mo146xb9724478(q4Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
