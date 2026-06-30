package t71;

/* loaded from: classes12.dex */
public abstract class a {
    public static android.content.Intent a(s71.b bVar) {
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddrUtil", "addressObj == null");
            return null;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("addressID", bVar.f485503d);
        intent.putExtra("nationalCode", bVar.f485512p);
        intent.putExtra("userName", bVar.f485510n);
        intent.putExtra("telNumber", bVar.f485511o);
        intent.putExtra("addressPostalCode", bVar.f485508i);
        intent.putExtra("proviceFirstStageName", bVar.f485505f);
        intent.putExtra("addressCitySecondStageName", bVar.f485506g);
        intent.putExtra("addressCountiesThirdStageName", bVar.f485507h);
        intent.putExtra("addressCountiesFourStageName", bVar.f485513q);
        intent.putExtra("addressDetailInfo", bVar.f485509m);
        intent.putExtra("formatErrorCode", 0);
        return intent;
    }
}
