package f00;

/* loaded from: classes9.dex */
public final class e {
    public e(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.widget.TextView priceTv, int i17, int i18, bw5.u8 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(priceTv, "priceTv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String e17 = item.e();
        boolean z17 = false;
        if (e17 != null) {
            if (e17.length() > 0) {
                z17 = true;
            }
        }
        if (z17) {
            priceTv.setText(item.e());
        } else {
            priceTv.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ner, ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ui(i18)));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveShoppingPriceView", "set product price for " + item.i() + ", price = " + ((java.lang.Object) priceTv.getText()));
        if (i18 > i17 || i18 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveShoppingPriceView", "invalid price,min:" + i18 + ",max:" + i17);
        }
    }
}
