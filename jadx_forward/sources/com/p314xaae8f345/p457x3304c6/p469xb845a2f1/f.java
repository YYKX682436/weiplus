package com.p314xaae8f345.p457x3304c6.p469xb845a2f1;

/* loaded from: classes5.dex */
public class f extends com.p314xaae8f345.p457x3304c6.p469xb845a2f1.AbstractC4061x2200db87 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p469xb845a2f1.e f129630a;

    public f(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e c4060x7aac656e, com.p314xaae8f345.p457x3304c6.p469xb845a2f1.e eVar) {
        super(c4060x7aac656e);
        this.f129630a = eVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p469xb845a2f1.AbstractC4061x2200db87
    /* renamed from: onInvoke */
    public void mo33115x48671b37(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e c4060x7aac656e, java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4062x2a5d9bb2.SaveSnapshotCompleteArg saveSnapshotCompleteArg = (com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4062x2a5d9bb2.SaveSnapshotCompleteArg) obj;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.e eVar = this.f129630a;
        if (eVar == null || saveSnapshotCompleteArg == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = saveSnapshotCompleteArg.f15928x5c4d208;
        if (c4093x6b88526b != null) {
            java.lang.String error = c4093x6b88526b.m33747x76b83bd1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
            return;
        }
        java.lang.String path = saveSnapshotCompleteArg.f15929x346425;
        nu0.f0 f0Var = (nu0.f0) eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageControlUIC", "[saveSnapshot] end index:" + f0Var.f421465a);
        f0Var.f421466b.mo146xb9724478(path);
    }
}
