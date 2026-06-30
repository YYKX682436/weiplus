package la5;

/* loaded from: classes14.dex */
public class a implements android.speech.tts.TextToSpeech.OnInitListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ la5.c f399129b;

    public a(la5.c cVar, java.lang.String str) {
        this.f399129b = cVar;
        this.f399128a = str;
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int i17) {
        la5.c cVar = this.f399129b;
        android.speech.tts.TextToSpeech textToSpeech = cVar.f399138c;
        if (textToSpeech != null) {
            textToSpeech.setLanguage(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() ? java.util.Locale.CHINESE : java.util.Locale.ENGLISH);
            cVar.f399138c.speak(this.f399128a, 0, null);
        }
    }
}
