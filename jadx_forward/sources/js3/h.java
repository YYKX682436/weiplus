package js3;

/* loaded from: classes4.dex */
public class h implements com.p314xaae8f345.mm.p794xb0fa9b5e.j, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383057d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p794xb0fa9b5e.r f383058e;

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReadMailTask", "read mail  %s", c10756x2a5d7b2d.f149939d);
        this.f383058e = rVar;
        java.lang.String str = c10756x2a5d7b2d.f149939d;
        this.f383057d = str;
        gm0.j1.d().g(new ms3.c(str));
        gm0.j1.d().a(11312, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReadMailTask", "read mail, errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        ms3.c cVar = (ms3.c) m1Var;
        if (!cVar.f412515f.equals(this.f383057d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ReadMailTask", "not my scene, ignore");
            return;
        }
        gm0.j1.d().q(11312, this);
        if (this.f383058e != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("err_type", i17);
            bundle.putInt("err_code", i18);
            bundle.putString("err_msg", str);
            bundle.putString("mail_id", this.f383057d);
            if (i17 == 0 && i18 == 0) {
                ks3.y0 y0Var = ((ks3.g1) cVar.f412513d.f152244b.f152233a).f393211d;
                if (y0Var != null) {
                    bundle.putString("mail_content", y0Var.f393316q);
                    java.util.LinkedList linkedList = y0Var.f393317r;
                    if (!linkedList.isEmpty()) {
                        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
                        java.util.Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            ks3.w0 w0Var = (ks3.w0) it.next();
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            bundle2.putString("attach_fileId", w0Var.f393295d);
                            bundle2.putString("attach_key", w0Var.f393300i);
                            bundle2.putString("attach_name", w0Var.f393296e);
                            bundle2.putString("attach_type", w0Var.f393298g);
                            bundle2.putInt("attach_size", w0Var.f393297f);
                            bundle2.putString("attach_download_url", w0Var.f393299h);
                            arrayList.add(bundle2);
                        }
                        bundle.putParcelableArrayList("mail_normal_attach", arrayList);
                    }
                    java.util.LinkedList linkedList2 = y0Var.f393318s;
                    if (!linkedList2.isEmpty()) {
                        java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>();
                        java.util.Iterator it6 = linkedList2.iterator();
                        while (it6.hasNext()) {
                            ks3.w0 w0Var2 = (ks3.w0) it6.next();
                            android.os.Bundle bundle3 = new android.os.Bundle();
                            bundle3.putString("attach_fileId", w0Var2.f393295d);
                            bundle3.putString("attach_key", w0Var2.f393300i);
                            bundle3.putString("attach_name", w0Var2.f393296e);
                            bundle3.putString("attach_type", w0Var2.f393298g);
                            bundle3.putInt("attach_size", w0Var2.f393297f);
                            bundle3.putString("attach_download_url", w0Var2.f393299h);
                            arrayList2.add(bundle3);
                        }
                        bundle.putParcelableArrayList("mail_big_attach", arrayList2);
                    }
                }
                ks3.m1 m1Var2 = ((ks3.g1) cVar.f412513d.f152244b.f152233a).f393212e;
                if (m1Var2 != null) {
                    android.os.Bundle bundle4 = new android.os.Bundle();
                    bundle4.putLong("cookie_xmail_uin", m1Var2.f393252d);
                    bundle4.putString("cookie_xmail_skey", m1Var2.f393254f);
                    bundle4.putString("cookie_xmail_sid", m1Var2.f393253e);
                    bundle.putParcelable("mail_cookie", bundle4);
                }
            }
            this.f383058e.a(bundle);
        }
    }
}
