package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class g2 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 f219082q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 l2Var, p13.u uVar) {
        super(uVar);
        this.f219082q = l2Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchLimitGroupMessage";
    }

    @Override // p13.c
    public int k() {
        return 24;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        android.database.Cursor o17;
        android.database.Cursor o18;
        o("start");
        p13.r c17 = p13.r.c(this.f432668n.f432674c, false, this.f219082q.f219151t);
        vVar.f432692d = c17;
        w13.h hVar = this.f219082q.f219142h;
        hVar.getClass();
        if (c17.a()) {
            o17 = new d95.d();
        } else {
            java.lang.String f17 = c17.f();
            o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) hVar.f423731f).o(java.lang.String.format("SELECT type, subtype, entity_id, aux_index, timestamp FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND status >= 0" + hVar.q() + " ORDER BY timestamp desc;", hVar.r(), hVar.o(), hVar.r(), hVar.o(), hVar.o(), f17), null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (o17.moveToNext()) {
            java.lang.String string = o17.getString(3);
            if (hashSet.add(string)) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.f2 f2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.f2(this, null);
                f2Var.f219067a = o17.getInt(0);
                f2Var.f219068b = o17.getInt(1);
                f2Var.f219069c = o17.getLong(2);
                f2Var.f219070d = o17.getString(3);
                f2Var.f219071e = o17.getLong(4);
                arrayList.add(f2Var);
                arrayList2.add(string);
            }
            if (arrayList.size() > this.f432668n.f432680i) {
                break;
            }
        }
        o17.close();
        vVar.f432693e = new java.util.LinkedList();
        o("findUsername");
        if (arrayList2.size() > 0) {
            w13.h hVar2 = this.f219082q.f219142h;
            p13.r rVar = vVar.f432692d;
            hVar2.getClass();
            if (rVar.a()) {
                o18 = new d95.d();
            } else {
                java.lang.String f18 = rVar.f();
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    stringBuffer.append("'");
                    stringBuffer.append(str);
                    stringBuffer.append("',");
                }
                java.lang.String substring = stringBuffer.substring(0, stringBuffer.length() - 1);
                o18 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) hVar2.f423731f).o(java.lang.String.format("SELECT MessageCount(%d, aux_index) FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND aux_index IN (%s) AND status >= 0" + hVar2.q() + ";", java.lang.Integer.valueOf(arrayList2.size()), hVar2.r(), hVar2.o(), hVar2.r(), hVar2.o(), hVar2.o(), f18, substring), null);
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            if (o18.moveToNext()) {
                java.lang.String[] split = o18.getString(0).split(" ");
                for (int i17 = 0; i17 < split.length; i17 += 2) {
                    hashMap.put(split[i17], java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[i17 + 1], 0)));
                }
            }
            o18.close();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.f2 f2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.f2) it6.next();
                p13.y yVar = new p13.y();
                yVar.f432717b = f2Var2.f219067a;
                yVar.f432718c = f2Var2.f219068b;
                yVar.f432719d = f2Var2.f219069c;
                java.lang.String str2 = f2Var2.f219070d;
                yVar.f432720e = str2;
                yVar.f432721f = f2Var2.f219071e;
                int intValue = hashMap.containsKey(str2) ? ((java.lang.Integer) hashMap.get(yVar.f432720e)).intValue() : 1;
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.C3(yVar.f432720e) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.o4(yVar.f432720e)) {
                    intValue = 0;
                }
                yVar.f432730o = java.lang.Integer.valueOf(intValue);
                vVar.f432693e.add(yVar);
            }
            o("findCount");
        }
        if (vVar.f432692d.f432665d.length <= 1 || vVar.f432693e.size() > 3) {
            return;
        }
        android.database.Cursor Q = ((w13.b) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(3)).Q(p13.r.b(vVar.f432692d.f432665d[0], true), null, o13.d.f423758k, o13.d.f423762o);
        if (Q.moveToNext()) {
            p13.y yVar2 = new p13.y();
            yVar2.f432720e = "create_talker_message\u200b";
            vVar.f432693e.add(yVar2);
        }
        Q.close();
        o("findTalkerConversation");
    }
}
