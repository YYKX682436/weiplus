package b50;

/* loaded from: classes9.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f17994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(yz5.l lVar) {
        super(1);
        this.f17994d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.pigeon.biz_base.ContactInfo contactInfo = (com.tencent.pigeon.biz_base.ContactInfo) obj;
        kotlin.jvm.internal.o.g(contactInfo, "contactInfo");
        this.f17994d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(contactInfo)));
        return jz5.f0.f302826a;
    }
}
