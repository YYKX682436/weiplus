package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29;

/* renamed from: com.tencent.mm.plugin.ipcall.model.IPCallSvrNotifyListener */
/* loaded from: classes14.dex */
public class C16122xa01ce5c7 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5646xf9912267> {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.q f223993d;

    public C16122xa01ce5c7() {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f39173x3fe91575 = -303045513;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5646xf9912267 c5646xf9912267) {
        byte[] bArr;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5646xf9912267 c5646xf99122672 = c5646xf9912267;
        if ((c5646xf99122672 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5646xf9912267) && (bArr = c5646xf99122672.f135973g.f89153a) != null && bArr.length > 0 && bArr[0] == 101) {
            int length = bArr.length - 1;
            byte[] bArr2 = new byte[length];
            java.lang.System.arraycopy(bArr, 1, bArr2, 0, length);
            try {
                r45.oe5 oe5Var = (r45.oe5) new r45.oe5().mo11468x92b714fd(bArr2);
                int i17 = oe5Var.f463733d;
                java.util.LinkedList linkedList = oe5Var.f463735f;
                if (linkedList != null) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        int i18 = ((r45.xe5) it.next()).f471547d;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.q qVar = this.f223993d;
                if (qVar != null) {
                    ((r83.e) qVar).f386423d.b(8, oe5Var, 0, 0);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallSvrNotifyListener", "parse PstnNotify error: %s", e17.getMessage());
            }
        }
        return false;
    }
}
