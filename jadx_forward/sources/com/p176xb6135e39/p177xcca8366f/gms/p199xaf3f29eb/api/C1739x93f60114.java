package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

/* renamed from: com.google.android.gms.common.api.AvailabilityException */
/* loaded from: classes13.dex */
public class C1739x93f60114 extends java.lang.Exception {
    private final x.b zaa;

    public C1739x93f60114(x.b bVar) {
        this.zaa = bVar;
    }

    /* renamed from: getConnectionResult */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb m17727xd9207c11(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01<? extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44> abstractC1746xcf54ed01) {
        x.b bVar = this.zaa;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05<? extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44> mo17755x10f860db = abstractC1746xcf54ed01.mo17755x10f860db();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(bVar.m174751x4aabfc28(mo17755x10f860db, null) != null, "The given API (" + mo17755x10f860db.zaa() + ") was not part of the availability request.");
        return (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb) this.zaa.m174751x4aabfc28(mo17755x10f860db, null));
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((x.j) this.zaa.keySet()).iterator();
        boolean z17 = true;
        while (it.hasNext()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a05 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05) it.next();
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb) this.zaa.m174751x4aabfc28(c1768x75462a05, null));
            z17 &= !c1700xff0c58bb.m17605x6e268779();
            arrayList.add(c1768x75462a05.zaa() + ": " + java.lang.String.valueOf(c1700xff0c58bb));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (z17) {
            sb6.append("None of the queried APIs are available. ");
        } else {
            sb6.append("Some of the queried APIs are unavailable. ");
        }
        sb6.append(android.text.TextUtils.join("; ", arrayList));
        return sb6.toString();
    }

    /* renamed from: getConnectionResult */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb m17728xd9207c11(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1749x484400ff<? extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44> interfaceC1749x484400ff) {
        x.b bVar = this.zaa;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05<? extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44> mo17755x10f860db = interfaceC1749x484400ff.mo17755x10f860db();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(bVar.m174751x4aabfc28(mo17755x10f860db, null) != null, "The given API (" + mo17755x10f860db.zaa() + ") was not part of the availability request.");
        return (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb) this.zaa.m174751x4aabfc28(mo17755x10f860db, null));
    }
}
